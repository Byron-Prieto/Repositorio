package co.edu.uniquindio.poo;

public class Main {
    public static void main(String[] args) {

        String texto = "Esteban es gay";

        EditorTexto editorTexto = new EditorTexto();

        editorTexto = new ConteoPalabras(editorTexto);
        editorTexto = new ResaltadoSintaxis(editorTexto);
        editorTexto = new CorreccionOrtografica(editorTexto);
        editorTexto = new ConversionMayusculas(editorTexto);

        System.out.println(editorTexto.ProcesarTexto(texto));
    }
}
