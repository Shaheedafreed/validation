package com.marlabs.resource.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.marlabs.resource.entity.ResourceEntity;
import com.marlabs.resource.repository.ResourceRepository;

@Service
public class ResourceService {

	@Autowired
	private ResourceRepository resourceRepository;
	
	public void addResource(ResourceEntity entity)
	{
		resourceRepository.save(entity);
	}
	  
	public List<ResourceEntity> getAllResource()
	{
		return resourceRepository.findAll();
	}
	public void deleteResource(String resourceId) 
	{
		resourceRepository.deleteById(resourceId);
	}
	
	public void uploadFile(MultipartFile file) throws IllegalStateException,IOException {
		file.transferTo(new File("E:\\FileUpload"+ file.getOriginalFilename()));
	}
	
//	public DatabaseFile storeFile(MultipartFile file) {
//        // Normalize file name
//        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
//
//        try {
//            // Check if the file's name contains invalid characters
//            if (fileName.contains("..")) {
//                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
//            }
//
//            DatabaseFile dbFile = new DatabaseFile(fileName, file.getContentType(), file.getBytes());
//
//            return dbFileRepository.save(dbFile);
//        } catch (IOException ex) {
//            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
//        }
//    }
//
//    public DatabaseFile getFile(String fileId) {
//        return dbFileRepository.findById(fileId)
//            .orElseThrow(() - > new FileNotFoundException("File not found with id " + fileId));
//    }
}
