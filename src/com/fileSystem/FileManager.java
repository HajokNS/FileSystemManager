package com.fileSystem;

import java.util.Arrays;

public class FileManager {
    private final FileEntity[] files;

    public FileManager(FileEntity[] files) {
        this.files = files;
        Arrays.sort(this.files);
    }

    public void displayFilesSortedByName() {
        System.out.println("Список файлів, упорядкований у алфавітному порядку:");
        for (FileEntity file : files) {
            System.out.println(file);
        }
    }

    public void displayFilesAboveSize(long maxSize) {
        System.out.println("\nСписок файлів, розмір яких перевищує " + maxSize + " байт:");
        for (FileEntity file : files) {
            if (file.getFileSize() > maxSize) {
                System.out.println(file);
            }
        }
    }

    public void displayFilesAboveAccessCount(int minAccessCount) {
        System.out.println("\nСписок файлів, кількість звернень до яких перевищує " + minAccessCount + ":");
        for (FileEntity file : files) {
            if (file.getAccessCount() > minAccessCount) {
                System.out.println(file);
            }
        }
    }
}
