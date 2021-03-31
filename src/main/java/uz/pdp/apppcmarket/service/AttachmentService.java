package uz.pdp.apppcmarket.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.apppcmarket.dto.Response;
import uz.pdp.apppcmarket.entity.Attachment;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service
public interface AttachmentService {

    Response saveFiles(MultipartFile[] files, MultipartFile[] images);

    List<Attachment> findAll();

    Response saveFile(MultipartHttpServletRequest request);

    Response download(Integer id, HttpServletResponse response);

    Response delete(Integer id);
}
