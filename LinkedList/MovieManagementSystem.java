class Movie{
	String MovieTitle;
	String Director;
	int YearOfRelease;
	int Rating;
	Movie next;
	Movie prev;
	Movie(String MovieTitle, String Director,int YearOfRelease,int Rating){
		this.MovieTitle=MovieTitle;
		this.Director=Director;
		this.YearOfRelease=YearOfRelease;
		this.Rating=Rating;
		this.next=null;
		this.prev=null;
	}
}
public class MovieManagementSystem {
	Movie head;
	Movie tail;
	static int size;
	
	public void addMovieForward(String MovieTitle, String Director,int YearOfRelease,int Rating) {
		Movie newMovie = new Movie(MovieTitle,Director,YearOfRelease,Rating);
		if(head==null) {
			head=newMovie;
			tail=newMovie;
			return ;
		}
		newMovie.next=head;
		head.prev=newMovie;
		head= newMovie;
		size++;
		
	}
	public void addMovieBackward(String MovieTitle, String Director,int YearOfRelease,int Rating) {
		Movie newMovie = new Movie(MovieTitle,Director,YearOfRelease,Rating);
		if(head==null) {
			head=newMovie;
			tail=newMovie;
			return;
		}
		tail.next=newMovie;
		newMovie.prev=tail;
		tail=newMovie;
		size++;
	}
	public void addMovieKthPosition(String MovieTitle, String Director,int YearOfRelease,int Rating,int k) {
		if(k==1) {
			 addMovieForward(MovieTitle,Director,YearOfRelease,Rating);
			return;
		}
		if(k==size+1) {
			 addMovieBackward(MovieTitle,Director,YearOfRelease,Rating);
				return;
		}
		Movie curr=head;
		for(int i=1;i<k-1;i++) {
			curr=curr.next;
		}
		Movie newMovie = new Movie(MovieTitle,Director,YearOfRelease,Rating);
		newMovie.next=curr.next;
		curr.next=newMovie;
		newMovie.prev=curr;
		size++;
	}
	public void removeMovie(String MovieTitle) {
		if(head==null) {
			return;
		}
		if(head.MovieTitle.equals(MovieTitle)) {
			head=head.next;
			if(head!=null) head.prev=null;
			else tail =null;
			size--;
			return;
		}
		Movie curr=head.next;
		while(curr!=null) {
			if(curr.MovieTitle.equals(MovieTitle) ){
				curr.prev.next=curr.next;
				if(curr.next!=null) {
					curr.next.prev=curr.prev;
				}
				else {
					tail=curr.prev;
				}
				size--;
				return;
			}
			curr=curr.next;
		}
		System.out.print("Movie is not found");
	}
	public void searchMovie(String MovieTitle,int Rating) {
		Movie curr=head;
		while(curr!=null) {
			if(curr.MovieTitle.equals(MovieTitle) && curr.Rating==Rating) {
				System.out.println("Movie Found");
				System.out.println("Movie name: "+ MovieTitle+ " rating: "+Rating);
				return ;
			}
		}
		System.out.print("Movie is not found");

		
	}
	public void updateMovie(String MovieTitle,int newRating) {
		Movie curr=head;
		while(curr!=null) {
			if(curr.MovieTitle.equals(MovieTitle) ) {
				System.out.println("Movie Found");
				curr.Rating=newRating;
				System.out.println("Update rating ");
				return ;
			}
		}
	}
	public void displayBackword(){
		Movie curr=tail;
		if(tail==null) {
			System.out.println("List is empty");
			return ;
		}
		int i=1;
		while(curr!=null) {
			System.out.println("Movie no: "+i);
			System.out.println("Movie Title: "+ curr.MovieTitle);
			System.out.println("Director name: "+curr.Director);
			System.out.println("Release date of movie: " +curr.YearOfRelease);
			System.out.println("Rating of Movies: "+curr.Rating);
			curr=curr.prev;
			System.out.println("\n");
			i++;
			
		}
		System.out.println();
	}
	public void displayForward(){
		Movie curr=head;
		if(head==null) {
			System.out.println("List is empty");
			return ;
		}
		int i=1;
		while(curr!=null) {
			System.out.println("Movie no: "+i);
			System.out.println("Movie Title: "+ curr.MovieTitle);
			System.out.println("Director name: "+curr.Director);
			System.out.println("Release date of movie: " +curr.YearOfRelease);
			System.out.println("Rating of Movies: "+curr.Rating);
			curr=curr.next;
			i++;
			System.out.println("\n");

			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
	    MovieManagementSystem mms = new MovieManagementSystem();

	    
	    mms.addMovieBackward("Inception", "Christopher Nolan", 2010, 9);
	    mms.addMovieBackward("The Dark Knight", "Christopher Nolan", 2008, 10);
	    mms.addMovieBackward("Interstellar", "Christopher Nolan", 2014, 9);

	    
	    mms.addMovieForward("Pulp Fiction", "Quentin Tarantino", 1994, 8);

	    mms.addMovieKthPosition("The Matrix", "Wachowskis", 1999, 8, 3);


	    System.out.println("Displaying all movies (forward):");
	    mms.displayForward();

	   
	    System.out.println("Displaying all movies (backward):");
	    mms.displayBackword();

	    System.out.println("Searching for 'Inception' with rating 9:");
	    mms.searchMovie("Inception", 9);

	 
	    System.out.println("\nSearching for 'Avatar' with rating 7:");
	    mms.searchMovie("Avatar", 7);

	    
	    System.out.println("\nRemoving 'The Matrix':");
	    mms.removeMovie("The Matrix");
	    mms.updateMovie("Inception", 4);

	  
	    System.out.println("Displaying all movies after deletion:");
	    mms.displayForward();
	}


}
