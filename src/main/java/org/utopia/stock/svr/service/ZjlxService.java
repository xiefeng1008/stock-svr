package org.utopia.stock.svr.service;

import org.springframework.web.multipart.MultipartFile;

public interface ZjlxService {
    int importCsv(MultipartFile file);
}
