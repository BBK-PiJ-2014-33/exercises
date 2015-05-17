import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Functional {
    public static void main(String[] args) {
        final List<String> friends = Arrays.asList ("John", "Kevin","Albert","Betty");
        //form a list where all the friends names are changed to uppercase
        List<String> uc = new ArrayList<>();


        //Version 1
        //for(String name: friends)
        //{
            //uc.add(name.toUpperCase());
        //}

        //Version 2
        //friends.forEach(name -> uc.add(name.toUpperCase()));

        //Version 3
        //friends.stream()
                //.map(name -> name.toUpperCase())
                //.collect(Collectors.toList());

        //Version 4
//        Function<String,String> f = x -> (x.toUpperCase());
//        System.out.println(f);
//        uc = friends.stream()
//                .map(f);
//                .collect(Collectors.toList());
//
//        System.out.println(friends);
//        System.out.println();

        //Version 5
        List<String> b =
                friends.stream()
                    .filter(x -> x.startsWith("B"))
                    .collect(Collectors.toList());

        //Version 6
        Optional <String> firstItem =
                            friends.stream()
                            .filter(x ->x.startsWith("B"))
                            .findFirst();
        System.out.println(firstItem.orElse());


    }
}
