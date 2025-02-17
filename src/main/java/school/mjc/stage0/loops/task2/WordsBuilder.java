package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int size = chars.length;
        int index = 0;
        while (index < size) {
            System.out.print(chars[index]);
            index++;
        }
    }
}
