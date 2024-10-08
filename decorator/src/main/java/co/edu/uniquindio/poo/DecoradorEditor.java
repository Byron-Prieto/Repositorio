package co.edu.uniquindio.poo;

public abstract class DecoradorEditor extends EditorTexto {
    
    protected EditorTexto editor;

    public DecoradorEditor(EditorTexto editor) {
        this.editor = editor;
    }

    @Override
    public String ProcesarTexto(String Texto){
        return editor.ProcesarTexto(Texto);
    }
}
