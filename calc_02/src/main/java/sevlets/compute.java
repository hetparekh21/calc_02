package sevlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class compute
 */
public class compute extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public compute() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String argument = request.getParameter("argument");
		
		double answer = calculate(argument);
	
		response.getWriter().append("answer : " + answer);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public double calculate(String argument) {
		
		System.out.println(argument);
		char[] args = argument.toCharArray();
		
		double a = 0 , b = 0 ;
		String A = "" , B = "" ; 
		char fun = 'z';
		int i = 0 ;
		int j = i + 1;
		
		System.out.println("lenght total : " + args.length );
		
		for(i = 0 ; j < args.length - 1 ; i++) {
			
			j = i + 1 ;
			
			System.out.println("i : " + i + ", j : " + j);
				
			if( args[j] == '*' || args[j] == '/' || args[j] == '-' || args[j] == '+' || args[j] == '*' || args[j] == '%') {
					
				if(a == 0) {
						
					A = A + args[i] ;
					
					a = Double.valueOf(A) ;
						
					fun = args[j] ;
						
					i = j + 1 ;
					
					j = i + 1 ;
						
					
				}else {
						
					B = B + args[i] ;
						
					b = Double.valueOf(B) ;
						
					a = sw(fun,a,b);
						
					fun = args[j] ;
						
					i = j + 1;
					
					j = i + 1 ;
						
					B = "" ;
						
					b = 0 ;
						
				}
					
			}
			
			if(i == args.length - 1) {
				
				B = B + args[i] ;
				
				b = Double.valueOf(B) ;
					
				a = sw(fun,a,b);
				
				System.out.println("wala lol" + a);
				
				break ;
				
			}
				
			if(a == 0) {
					
				A = A + args[i] ;
					
			}else {
					
				B = B + args[i];
					
			}
			
			if(j == args.length - 1) {
					
				B = B + args[j] ;
				
				b = Double.valueOf(B) ;
					
				a = sw(fun,a,b);
				
				System.out.println("lol wala" + a);
				
				break ;
					
			}
			
			System.out.println("a : " + a + ", A : " + A + ", b : " + b + ", B : " + B + ", fun : " + fun + ", i : " + args[i] + ", j : " + args[j]);
			
		}	
		
		return a ;
		
	}
	
	private double sw(char fun , double a , double b) {
		
		switch(fun) {
		
		case '*':
			a = a * b ;
			break ;
			
		case '-' :
			a = a - b ;
			break ;
			
		case '+' :
			a = a + b ;
			break ;
			
		case '/' :
			a = a / b ;
			break ;
			
		case '%' :
			a = a % b ;
			break ;	
			
		default :
			break ;
		
		}
		
		return a ;
		
	}

}
