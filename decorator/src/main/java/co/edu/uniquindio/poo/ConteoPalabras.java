package co.edu.uniquindio.poo;

public class ConteoPalabras extends DecoradorEditor {
    
    public ConteoPalabras(EditorTexto editor) {
        super(editor);
    }

    @Override
    public String ProcesarTexto(String Texto){
        
        Texto = super.ProcesarTexto(Texto);

        int numPalabras = Texto.split("//s+ ").length;
        return Texto + " (" + numPalabras + " palabras)";
    }
}
