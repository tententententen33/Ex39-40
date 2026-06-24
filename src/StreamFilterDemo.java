import java.util.stream.Stream; 
 
public class StreamFilterDemo { 
    public static void main(String[] args) { 
        Stream.of( 
                "https://www.uhe.ac.jp/",  
                "UHEshop", 
                "https://codezine.jp/", 
                "https://wings.msn.to/", 
                "UheProject" 
        ) 
        .filter(s -> s.startsWith("https://")) 
        .forEach(System.out::println); 
    } 
} 
 