package extra_Practices;

public class Book {
	
	String title="";
	  String author="";
	  String tableOfContents="";
	  int nextPage=1;
	  
	  public Book(String title, String author){
	    this.title=title;
	    this.author=author;
	    
	  }
	  public String gettableOfContents(){
	    return tableOfContents;
	  }
	  public int getPage(int page){
	   
	    return nextPage=nextPage+page;
	  }
	  public void toString1(){
	    
	    System.out.println( "title "+ title+ "\n author "+ author);
	  }
	  public void addChapter(String title, int pages){
	    getPage(pages);
	    System.out.println("\n "+ title+" "+ nextPage);
	  }

}
