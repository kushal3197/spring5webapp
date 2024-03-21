/**
 * @author Kushal Kothari
 * created on 21-Mar-2024
 */
package guru.springframework.spring5webapp.domain;

/**
 * @author Kushal
 *
 */
public class Book {
	private String title;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	private String isbn;
}
