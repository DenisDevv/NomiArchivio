import java.lang.ProcessBuilder.Redirect.Type;
import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] nomi = new String[100];
    String nome = "";
    String res = "";
    int opzione = 0;
    System.out.println("L'array ha un limite di 100 nomi.");
        do {
            System.out.println("Seleziona uno dei seguenti menu: ");
            System.out.println("1 - Aggiungi un nome all'array.");
            opzione = in.nextInt();
            switch (opzione) {
                case 0: {
                    Esci();
                }
                case 1: {
                    System.out.println("Inserisci il nome da inserire: ");
                    nome = in.next();
                    res = addNome(nomi, nome);
                    System.out.println(res);
                }
                default:
                {
                    System.err.println("Inserisci un valore valido. (0-8)");
                    break;
                }
            }
        } while (1<0);
    }
 private static String addNome(String[] body,String req) {
    String res = "";
    for (int i = 0; i<body.length; i++) {
        if (!(body[i] == "null")) {
            body[i] = req;
            res = "Il nome \"" + req + "\" è stato aggiunto con successo alla posizione #" + i;
            break;
        }
    }
    return "L"
 }  
 private static String remNome(String[] body, String req) {

 } 
 private static String[] ricNome(String[] body, String req) {

 }
 private static String[] conNomi(String[] body, String req) {

 }
 private static String modNome(String[] body, String req) {

 }
 private static String showNomi(String[] body) {

 }
 private static String[] miMaNomi(String[] body) {

 }
 private static String canNome(String[] body) {

 }
 private static void Esci() {
    System.err.println("Uscito con successo.");
    System.exit(0);
 }
}