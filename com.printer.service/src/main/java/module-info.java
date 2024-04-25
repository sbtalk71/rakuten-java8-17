module com.printer{
	exports com.printer.service;
	provides com.printer.service.Printer with com.printer.service.impl.PrinterServiceImpl;
}