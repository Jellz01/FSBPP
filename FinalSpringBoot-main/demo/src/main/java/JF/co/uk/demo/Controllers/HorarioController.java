package JF.co.uk.demo.Controllers;

import JF.co.uk.demo.models.Horario;
import JF.co.uk.demo.services.HorarioService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/horarios")
public class HorarioController {

    private final HorarioService horarioService;

    public HorarioController(HorarioService horarioService) {
        this.horarioService = horarioService;
    }

    // Endpoint to get all schedules between a date range
    @GetMapping("/between")
    public List<Horario> getSchedulesBetween(@RequestParam("startDate") LocalDate startDate,
                                             @RequestParam("endDate") LocalDate endDate) {
        return horarioService.findByFechaInicioBetween(startDate, endDate);
    }

    // Endpoint to get all active schedules
    @GetMapping("/active")
    public List<Horario> getActiveSchedules() {
        return horarioService.findActiveSchedules();
    }

    // Endpoint to get schedules that overlap a given time range
    @GetMapping("/overlapping")
    public List<Horario> getOverlappingSchedules(@RequestParam("fechaInicio") LocalDate fechaInicio,
                                                 @RequestParam("fechaFin") LocalDate fechaFin) {
        return horarioService.findOverlappingSchedules(fechaInicio, fechaFin);
    }
}
