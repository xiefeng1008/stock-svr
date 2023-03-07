package org.utopia.stock.svr.service;

import org.springframework.web.multipart.MultipartFile;

public interface AlermService {
    int importCsv(MultipartFile file);
}
