package Übungsstunde;

import java.awt.print.*;

/**
 * druckt ein EinText-Objekt aus
*/
public class Ausdruck {
	/**
	 * druckt ein Übungsstunde.Dokument-Objekt aus
	*/
	public static void main(String[] args) throws PrinterException {
		PrinterJob pjob = PrinterJob.getPrinterJob();
		Dokument zuDruckenderText = new Dokument();
		pjob.setPrintable(zuDruckenderText);
		if ( pjob.printDialog() == false )   
			return;
		pjob.print();
	}
}
