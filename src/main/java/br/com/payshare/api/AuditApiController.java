package br.com.payshare.api;

import br.com.payshare.PayshareApplication;
import br.com.payshare.model.Audit;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(PayshareApplication.API_PREFIX + "/payshare/audit")
public interface AuditApiController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<Audit>> findAll();

    @GetMapping(value = "/download/csv", produces = MediaType.ALL_VALUE)
    ResponseEntity<?> downloadCSV();
}
