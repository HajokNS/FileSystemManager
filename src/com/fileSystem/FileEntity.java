package com.fileSystem;

public class FileEntity implements Comparable<FileEntity> {
    private final String fileName;
    private final long fileSize;
    private final String creationDate;
    private final int accessCount;

    public FileEntity(String fileName, long fileSize, String creationDate, int accessCount) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.creationDate = creationDate;
        this.accessCount = accessCount;
    }

    @Override
    public int compareTo(FileEntity other) {
        return this.fileName.compareTo(other.fileName);
    }

    public String getFileName() {
        return fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public int getAccessCount() {
        return accessCount;
    }

    @Override
    public String toString() {
        return "FileEntity{" +
            "fileName='" + fileName + '\'' +
            ", fileSize=" + fileSize +
            ", creationDate='" + creationDate + '\'' +
            ", accessCount=" + accessCount +
            '}';
    }
}
