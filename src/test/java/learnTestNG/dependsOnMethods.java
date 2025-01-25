package learnTestNG;

import org.testng.annotations.Test;

public class dependsOnMethods {
	@Test
	public void signUp() {
		System.out.println("signup");
	}
	@Test(dependsOnMethods = {"signUp","Login","uploadProfilePic","sendFriendRequest","acceptFriendRequest"})
	public void likePhoto() {
		System.out.println("likePhoto");
	}
	@Test(dependsOnMethods = {"signUp","Login","uploadProfilePic","sendFriendRequest","acceptFriendRequest"})
	public void PostComment() {
		System.out.println("PostComment");
	}
	@Test(dependsOnMethods = {"signUp","Login","uploadProfilePic"})
	public void sendFriendRequest() {
		System.out.println("sendFriendRequest");
	}
	
    @Test(dependsOnMethods = {"signUp","Login","uploadProfilePic","sendFriendRequest"})
	public void deleteFriendRequest() {
		System.out.println("deleteFriendRequest");
	}
    
    @Test(dependsOnMethods = "signUp")
	public void Login() {
		System.out.println("Login");
	}
    
    @Test(dependsOnMethods = {"signUp","Login"})
	public void uploadProfilePic() {
		System.out.println("uploadProfilePic");
	}
    
    @Test(dependsOnMethods = {"signUp","Login","uploadProfilePic","sendFriendRequest"})
    public void acceptFriendRequest() {
		System.out.println("acceptFriendRequest");
	}
}
