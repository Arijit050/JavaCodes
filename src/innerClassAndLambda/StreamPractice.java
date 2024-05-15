package innerClassAndLambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void main(String[] args) {
	 List<String> name = Arrays.asList("Arijit","Pushpendu","Anirban","Ashish");
	 Map<String,Integer> map = Map.of("Arijit",100,"Pushpendu",102,"Anirban",103,"Ashish",104);
	 
	 name.stream().filter(str->str.length()>6&&str.length()<10).forEach(System.out::println);s
	// name.stream().map(names->names.toUpperCase()).collect(Collectors.toMap(k,v)).forEach(System.out::println);;

	}

}
