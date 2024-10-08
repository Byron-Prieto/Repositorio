package co.edu.uniquindio.poo;

public class CorreccionOrtografica extends DecoradorEditor {
    
    public CorreccionOrtografica(EditorTexto editor) {
        super(editor);
    }

    @Override
    public String ProcesarTexto(String Texto){
        return Texto;
    }
        
}
