package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** *
 * Created by marcus.rodrigues on 04/04/2015.
 *
 * Classe utilitaria para manipular Data e Hora
 */
public class DateUtil {

    /**
     * Metodo para verificar o formato da Data
     *
     * @param data
     *
     * @return
     */
    public static boolean verificaData(String data)
    {
       return(data.matches("\\d{2}/\\d{2}/\\d{4}"));
    }

    /**
     * Metodo para passar uma String de data para o tipo Date
     * @param data String de data informada pelo usuario
     * @return Date formatado
     * @throws ParseException
     */
    public static Date stringToDate(String data) throws ParseException
    {
        return(new SimpleDateFormat("dd/MM/yyyy").parse(data));
    }

    public static Date stringToDateHour(String data) throws ParseException
    {
        return(new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data));
    }


    public static String dateToString(Date data){
        return(new SimpleDateFormat("dd/MM/yyyy").format(data));
    }

    public static String dateHourToString(Date data){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String dataString = formatador.format(data);
        return(dataString);
    }


}
