public class transition {
    String state1;
    String state2;
    char word;

    public transition(String state1, String state2, char word){
        this.state1 = state1;
        this.state2 = state2;
        this.word = word;
    }

    public String get_first_state(){
        return state1;
    }

    public String get_second_state(){
        return state2;
    }

    public char get_word(){
        return word;
    }
}
