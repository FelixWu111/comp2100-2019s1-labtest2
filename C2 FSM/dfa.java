import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class dfa {
    public String load_initial_state(File filename){
        try{
            InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
            BufferedReader br = new BufferedReader(reader);
            String line ="";
            while (line != null) {
                line = br.readLine();
                if (line != null){
                    String[] content = line.split(" ");
                    if (content[0].equals("initial")){
                        return content[1];
                    }
                }

            }

        }catch(Exception e){
            e.printStackTrace();
        }
        return "";
    }

    public Set<String> load_final_state(File filename){
        Set<String> res = new HashSet<>();
        try{
            InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
            BufferedReader br = new BufferedReader(reader);
            String line ="";
            while (line != null) {
                line = br.readLine();
                if (line != null){
                    String[] content = line.split(" ");
                    if (content[0].equals("accepting")){
                        for (int i=1;i<content.length;i++){
                            res.add(content[i]);
                        }
                    }
                }

            }

        }catch(Exception e){
            e.printStackTrace();
        }
        return res;
    }

    public Set<transition> load_transition(File filename){
        Set<transition> res = new HashSet<>();
        try{
            InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
            BufferedReader br = new BufferedReader(reader);
            String line ="";
            while (line != null) {
                line = br.readLine();
                if (line != null){
                    String[] content = line.split(" ");
                    if (content[0].equals("transition")){
                        transition T = new transition(content[1], content[2], content[3].charAt(0));
                        res.add(T);
                    }
                }

            }

        }catch(Exception e){
            e.printStackTrace();
        }
        return res;
    }

    public boolean accept_words(String initial_state, Set<String> final_state, Set<transition> transitions, String words){
        //TODO: FIX HERE.
        
        return false;
    }

    public static void main(String[] args) {
        String path = "data.dfa";
        File filename = new File(path);

        dfa d = new dfa();
        String initial_state =  d.load_initial_state(filename);
        Set<String> final_state = d.load_final_state(filename);
        Set<transition> T = d.load_transition(filename);

        String[] wordbag1 = {"learnplanning", "learnduty", "reinforcement"};
        String[] wordbag2 = {"reinfo", "plan"};
        for (String s:wordbag1){
            if (d.accept_words(initial_state,final_state,T,s)){
                System.out.println("word "+s+" --> OK");
            }else{
                System.out.println("word "+s+" --> WRONG!!!");
            }
        }
        for (String s:wordbag2){
            if (!d.accept_words(initial_state,final_state,T,s)){
                System.out.println("word "+s+" --> OK");
            }else{
                System.out.println("word "+s+" --> WRONG!!!");
            }
        }

    }
}
