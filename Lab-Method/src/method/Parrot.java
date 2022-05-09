package method;

public class Parrot {
	
	public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.talk();
        
        String person = "Niles";
        parrot.greetHuman(person);
        
        String[] words = {"Howdy", "Polly", "wanna", "cracker"};
        parrot.repeat(words);
    }

    //create your first method here
    public void talk(){
        System.out.println("Squawk Squawk!");
    }
    
    public void greetHuman(String name){
    	System.out.println("Hi " + name);
    }

}
