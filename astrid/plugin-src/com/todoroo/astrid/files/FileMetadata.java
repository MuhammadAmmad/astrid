package com.todoroo.astrid.files;

import com.todoroo.andlib.data.Property.LongProperty;
import com.todoroo.andlib.data.Property.StringProperty;
import com.todoroo.andlib.utility.DateUtilities;
import com.todoroo.astrid.data.Metadata;

public class FileMetadata {

    /** metadata key */
    public static final String METADATA_KEY = "file"; //$NON-NLS-1$

    public static final String FILES_DIRECTORY = "attachments"; //$NON-NLS-1$

    /** Constants for file types */
    public static final String FILE_TYPE_AUDIO = "audio/m4a"; //$NON-NLS-1$
    public static final String FILE_TYPE_IMG = "image/png"; //$NON-NLS-1$

    public static final StringProperty FILE_PATH = new StringProperty(Metadata.TABLE,
            Metadata.VALUE1.name);

    public static final StringProperty FILE_TYPE = new StringProperty(Metadata.TABLE,
            Metadata.VALUE2.name);

    public static final LongProperty ATTACH_DATE = new LongProperty(Metadata.TABLE,
            Metadata.VALUE3.name);

    public static final LongProperty REMOTE_ID = new LongProperty(Metadata.TABLE,
            Metadata.VALUE4.name);

    public static final StringProperty URL = new StringProperty(Metadata.TABLE,
            Metadata.VALUE5.name);


    public static Metadata createNewFileMetadata(long taskId, String filePath, String fileType) {
        Metadata metadata = new Metadata();
        metadata.setValue(Metadata.KEY, METADATA_KEY);
        metadata.setValue(Metadata.TASK, taskId);
        metadata.setValue(FILE_PATH, filePath);
        metadata.setValue(FILE_TYPE, fileType);
        metadata.setValue(REMOTE_ID, 0L);
        metadata.setValue(ATTACH_DATE, DateUtilities.now());
        return metadata;
    }

}
