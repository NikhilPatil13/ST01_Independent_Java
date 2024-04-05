package com.notetaker.servlets;

import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.notetaker.entities.Note;
import com.notetaker.helper.FactoryProvider;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditNoteServlet
 */
@WebServlet("/EditNoteServlet")
public class EditNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EditNoteServlet() {
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try 
		{
			// collection noteId,noteTitle and noteContent from request
			int noteId = Integer.parseInt(request.getParameter("noteId").trim());
			System.out.println(noteId);
		
			String noteTitle = request.getParameter("noteTitle");
		
			String noteContent = request.getParameter("noteContent");
		
			// get note having noteId matching with request.noteId
			Session session = FactoryProvider.getFactory().openSession();
			
			Note note = (Note)session.get(Note.class, noteId);
					
			// to save permanently in database we need a transaction
			Transaction transaction = session.beginTransaction();
			
			// setting new values to note
			note.setNoteTitle(noteTitle);
			note.setNoteContent(noteContent);
			note.setNoteAddedDate(new Date());
			
			// commit transaction
			transaction.commit();
			
			// close the session
			session.close();
			
			// redirect to allNotes.jsp
			response.sendRedirect("allNotes.jsp");
		}
		catch(Exception e)
		{
			System.out.println("Exception occured is EditNoteServlet - "+e.getMessage());
		}
			
		
	}

}
