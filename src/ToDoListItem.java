public class ToDoListItem {
    String name;
    boolean compleated = false;

    public ToDoListItem(String name) {
        this.name = name;
    }
    public String toString(){
        String compleatedText;
       if (compleated == true){
           compleatedText = "Завершено";
        } else {
           compleatedText = "Не завершено";
       }
        return " Дело : " + this.name + " " + compleatedText;

    }
}
