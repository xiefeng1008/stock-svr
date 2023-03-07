package org.utopia.stock.svr.service;

import org.springframework.web.multipart.MultipartFile;

public interface PriceService {
    int importCsv(MultipartFile file);
}
