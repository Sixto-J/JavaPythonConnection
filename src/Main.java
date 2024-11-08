import javax.script.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");



        public static void main(String[] args) throws ScriptException, IOException {


            StringWriter writer = new StringWriter(); //ouput will be stored here

            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptContext context = new SimpleScriptContext();

            context.setWriter(writer); //configures output redirection
            ScriptEngine engine = manager.getEngineByName("python");
            engine.eval(new FileReader("/home/dam/Baixades/numbers.py"), context);
            System.out.println(writer.toString());
        }


}