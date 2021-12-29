package Aplication;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import etities.Comment;
import etities.Post;

public class Program_post {
	
	

		public static void main(String[] args) throws ParseException {
			Locale.setDefault(Locale.US);
			Scanner sc= new Scanner(System.in);
			
			
			List<Post> posts= new ArrayList();
			
			
			char confirmacao;
			char confirmacao2;
			
			
			do {
			System.out.println("data da mensagem(dd/MM/yyyy):  ");
			String date =sc.next();
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			Date moment = formato.parse(date);//convertendo de string para data
			sc.nextLine();
			
			System.out.println("title da msg: ");
			String title= sc.nextLine();
			
			System.out.println("conteudo do texto: ");
			String content= sc.nextLine();
			
			System.out.println("quantos likes teve");
			int likes=sc.nextInt();
			sc.nextLine();
			//adiconando um objeto
			Post post=new Post( moment,  title,  content,  likes);
			
			//adicionando comentarios no obj post
			do {
				System.out.println("adicione um comentario");
				String comentario=sc.nextLine();
				
				
				Comment comentario_= new Comment(comentario);
				
				post.addComentario(comentario_);
				
				System.out.println("mais uma comentário: s/n");
				 confirmacao= sc.next().charAt(0);
				 sc.nextLine();
				
				
				
			}while(confirmacao=='s');
			
			
			//adicionando minha postagem na lista post
			posts.add(post);
			
		
			System.out.println("mais uma mensagem= s/n");
			 confirmacao2= sc.next().charAt(0);
			
			} while(confirmacao2=='s');
			
			
			//imprimir conteudo do post 
			for(int i=0;i<posts.size();i++) {
			System.out.println(posts.get(i));
			//imprimindo os comentarios 
			for(int j=0;i<posts.get(i).getLista_comentario().size(); j++) {
			System.out.println(posts.get(i).getLista_comentario().get(j));
			}
			}
			
			
			
			
			
			
			
			
			sc.close();
			
		}

	}


