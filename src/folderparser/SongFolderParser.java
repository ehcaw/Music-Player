package folderParser; // Added a line of code to run in my computer - Anhadh Sran

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.io.FileFilter;

public class SongFolderParser {
	File rootFolder;
	List<File> mp3List;
	int size;
	
	/**
	 * Creates a new SongFolderParser and finds mp3s starting from a root folder.
	 * @param filePath Root folder to search for mp3s from.
	 */
	public SongFolderParser(String filePath) {
		rootFolder = new File(filePath);
		mp3List = new ArrayList<File>();
		size = 0;
		findMp3();
	}
	
	private void findMp3() {
		Stack<File> fileList = new Stack<File>();
		File tmpDir;
		FileFilter filterDir = new FileFilter() {
			@Override
			public boolean accept(File file) {
				return file.isDirectory();
			}
		};
		FileFilter filterMp3 = new FileFilter() {
			@Override
			public boolean accept(File file) {
				return file.getName().endsWith(".mp3");
			}
		};
		fileList.push(rootFolder);
		while (!fileList.empty()) {
			tmpDir = fileList.pop();
			File[] arr = tmpDir.listFiles(filterDir);
			for (File f : arr) {
				fileList.push(f);
			}
			arr = tmpDir.listFiles(filterMp3);
			for (File m : arr) {
				mp3List.add(m);
				size++;
			}
		}
	}
	
	/**
	 * Returns the size of the mp3 list (amount of mp3s in the folder).
	 * @return
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Returns the ith song's file path as a String.
	 * @param i Index of song path to be returned.
	 * @return
	 */
	public String getPath(int i) {
		return mp3List.get(i).getAbsolutePath();
	}
}