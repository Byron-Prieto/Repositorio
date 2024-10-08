package co.edu.uniquindio.poo;

public class ResaltadoSintaxis extends DecoradorEditor {

    public ResaltadoSintaxis(EditorTexto editor) {
        super(editor);
    }

    @Override
    public String ProcesarTexto(String Texto){
        return Texto;
    }

}