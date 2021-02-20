package TC.TC.service;

import java.util.Calendar;
import java.util.Date;

import TC.TC.domain.PagamentoComBoleto;
import org.springframework.stereotype.Service;


@Service
public class BoletoService {
	
	public void PreencherPagamentoComBoleto(PagamentoComBoleto pgt, Date instantePedido) {
		Calendar cal =  Calendar.getInstance();
		cal.setTime(instantePedido);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		pgt.setDataVencimento(cal.getTime());
	}
	
}
