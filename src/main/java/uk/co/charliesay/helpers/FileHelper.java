package uk.co.charliesay.helpers;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FileHelper {

    public static Optional<String> fileToString(String filePath){
        Optional optional = Optional.empty();
        try {
            List<String> strings = Files.readAllLines(Paths.get(filePath),
                    StandardCharsets.UTF_8);
            optional = Optional.of(strings.toString().replace("[","").replace("]",""));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return optional;
    }

    public static List<String> fileToList(String filePath){
        List fileList = new ArrayList();
        try {
            fileList =  Files.readAllLines(Paths.get(filePath),
                    StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileList;
    }

    public static List<Integer> fileToIntegerList(String filePath){
        List fileList = new ArrayList();
        try {
          fileList = Files.readAllLines(Paths.get(filePath),
                    StandardCharsets.UTF_8).stream().map(Integer::parseInt).collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileList;
    }

}
