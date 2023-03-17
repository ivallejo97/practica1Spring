package com.example.practica1Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
@RequestMapping(ControladorInstalaciones.INSTALACIONES)
public class ControladorInstalaciones {
    public static final String INSTALACIONES = "/web";

    @Autowired
    ServicioInstalaciones servicioInstalaciones;

    @GetMapping
    public String getInstalacionesQuote(Model model){
        InstalacionesQuote[] instalacionesQuote = servicioInstalaciones.getInstalacionesQuote();

            int i = (int) (Math.random()*13);
            //int i = (int) (Math.random()*13);


            model.addAttribute("anys", instalacionesQuote[i].anys());
            model.addAttribute("polideportivos", instalacionesQuote[i].camps_poliesportius());
            model.addAttribute("atletismo", instalacionesQuote[i].espais_d_atletisme());
            model.addAttribute("piscinas_libres", instalacionesQuote[i].piscines_a_l_aire_lliure());
            model.addAttribute("piscinas_cubiertas", instalacionesQuote[i].piscines_cobertes());
            model.addAttribute("pistas_polideportivas", instalacionesQuote[i].pistes_poliesportives());
            model.addAttribute("pavellones", instalacionesQuote[i].pavellons());
            model.addAttribute("pistas_tenis", instalacionesQuote[i].pistes_de_tennis());
            model.addAttribute("pistas_padel", instalacionesQuote[i].pistes_de_p_del());
            model.addAttribute("salas_deportivas", instalacionesQuote[i].sales_esportives());
            model.addAttribute("pistas_squash", instalacionesQuote[i].pistes_de_tennis());
            model.addAttribute("fronton", instalacionesQuote[i].frontons());
            model.addAttribute("petancas", instalacionesQuote[i].espais_de_petanca());
            model.addAttribute("otros", instalacionesQuote[i].altres_espais_esportius());
            model.addAttribute("restantes", instalacionesQuote[i].rees_d_activitat_esportiva());
            model.addAttribute("espacios_censados", instalacionesQuote[i].total_espais_censats());
            model.addAttribute("instalaciones_totales", instalacionesQuote[i].instal_lacions());



        return "web";
    }

}
