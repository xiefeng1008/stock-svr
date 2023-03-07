package org.utopia.stock.svr.service;

import org.springframework.web.multipart.MultipartFile;

public interface DzjyService {
    int importCsv(MultipartFile file);
}
