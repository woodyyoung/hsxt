package com.gy.hsi.ds.common.utils.comparator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import difflib.Delta;
import difflib.DiffUtils;
import difflib.Patch;

/**
 * @author knightliao
 */
@SuppressWarnings("rawtypes")
public class FileComparator extends CommonComparator {

    private final File original;

    private final File revised;

    public FileComparator(File original, File revised) {
        this.original = original;
        this.revised = revised;
    }

	@SuppressWarnings("unchecked")
	protected List<Delta> getDeltas() throws IOException {

        final List<String> originalFileLines = fileToLines(original);
        final List<String> revisedFileLines = fileToLines(revised);

		final Patch patch = DiffUtils.diff(originalFileLines, revisedFileLines);

        return patch.getDeltas();
    }

    @SuppressWarnings("resource")
	private List<String> fileToLines(File file) throws IOException {
        final List<String> lines = new ArrayList<String>();
        String line;
        final BufferedReader in = new BufferedReader(new FileReader(file));
        while ((line = in.readLine()) != null) {
            lines.add(line);
        }

        return lines;
    }

}
