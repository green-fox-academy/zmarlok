public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";

        // Add "My todo:" to the beginning of the todoText

        todoText = "My todo: \n" +todoText;

        // Add " - Download games" to the end of the todoText

        todoText = todoText + " - Download games";

        // Add " - Diablo" to the end of the todoText but with indention

        todoText = todoText + "\n     - Diablo";

        System.out.println(todoText);

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

    }
}
