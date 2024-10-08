package co.edu.uniquindio.poo;

public class ConversionMayusculas extends DecoradorEditor {
    
    public ConversionMayusculas(EditorTexto editor) {
        super(editor);
    }

    @Override
    public String ProcesarTexto(String Texto){
        Texto = super.ProcesarTexto(Texto);

        Texto = Texto.toUpperCase();

        return Texto;
    }
}
