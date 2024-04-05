package com.notetaker.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.notetaker.entities.Note;
import com.notetaker.helper.FactoryProvider;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveNoteServlet
 */
@WebServlet("/SaveNoteServlet")
public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SaveNoteServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try 
		{
			
			// need to collect parameters coming with request
			String noteTitle = request.getParameter("noteTitle");
			String noteContent = request.getParameter("noteContent");
			
			// create object of Note to set parameter values
			Note note_01 = new Note();
			note_01.setNoteTitle(noteTitle);
			note_01.setNoteContent(noteContent);
			note_01.setNoteAddedDate(new Date());
			
			System.out.println("data set");
			
			// save note_01 
			// call getSessionFactory() from FactoryProvider class to create a new SessionFactory
			Session session = FactoryProvider.getFactory().openSession();
			
			System.out.println("session got");

			
			// to save we need to beginTransaction
			Transaction transaction = session.beginTransaction();
			
			session.save(note_01);
			
			System.out.println("data saved");
			
			transaction.commit();
			
			// need to close session after use
			session.close();
			
			// show note is added on browser
		
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<h1 style='text-align:center'>Note is added.</h1>");
		
			// forward to allNotes.jsp page
			RequestDispatcher rd = request.getRequestDispatcher("/allNotes.jsp");
			rd.include(request, response);
		}
		catch(Exception e) 
		{
			System.out.println("Exception Occured is SaveNoteServlet : "+e.getMessage());
		}
	}

}