package org.utopia.stock.svr.service;

import org.springframework.web.multipart.MultipartFile;

public interface HoldService {
    int importCsv(MultipartFile file);
}
