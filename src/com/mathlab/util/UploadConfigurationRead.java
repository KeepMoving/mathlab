package com.mathlab.util;
import java.io.File;
import java.io.FileInputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class UploadConfigurationRead {


	private static String PFILE = "upload.properties";

	private URI uri = null;

	private long m_lastModifiedTime = 0;

	private File m_file = null;

	private Properties m_props = null;

	private static UploadConfigurationRead m_instance = new UploadConfigurationRead();

	private UploadConfigurationRead() {
		try {
			m_lastModifiedTime = getFile().lastModified();
			if (m_lastModifiedTime == 0) {
				System.err.println(PFILE + "file does not exist!");
			}
			m_props = new Properties();
			m_props.load(new FileInputStream(getFile()));

		} catch (URISyntaxException e) {
			System.err.println(PFILE+"�ļ�·������ȷ");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println(PFILE+"�ļ���ȡ�쳣");
			e.printStackTrace();
		}
	}

	private File getFile() throws URISyntaxException {
		URI fileUri = this.getClass().getClassLoader().getResource(PFILE).toURI();
		m_file = new File(fileUri);
		return m_file;
	}

	public synchronized static UploadConfigurationRead getInstance() {
		return m_instance;
	}

	public String getConfigItem(String name, String defaultVal) {
		long newTime = m_file.lastModified();
		// ��������ļ��Ƿ��޸�
		if (newTime == 0) {
			// �����ļ�������
			if (m_lastModifiedTime == 0) {
				System.err.println(PFILE + " file does not exist!");
			} else {
				System.err.println(PFILE + " file was deleted!!");
			}
			return defaultVal;
		} else if (newTime > m_lastModifiedTime) {
			m_props.clear();
			try {
				m_props.load(new FileInputStream(getFile()));
			} catch (Exception e) {
				System.err.println("�ļ����¶�ȡ�쳣");
				e.printStackTrace();
			}
		}
		m_lastModifiedTime = newTime;
		String val = m_props.getProperty(name);
		if (val == null) {
			return defaultVal;
		} else {
			return val;
		}
	}

	public String getConfigItem(String name) {
		return getConfigItem(name, "");
	}

    public List getAllFiles(String absoluteDir){    
        //存放所有文件绝对路径名的list    
        List<String> files=new ArrayList();    
        //当前目录的file实例    
        File parentDir=new File(absoluteDir);    
        //列举当前目录下的所有文件和目录的名字    
        String []list=parentDir.list();    
        for(String s: list){    
            //绝对路径名    
            String name = absoluteDir+"/"+s;
            String filename = s;
            File instance=new File(name);    
            //如果是文件则添加到list    
            if(instance.isFile()){    
                files.add(filename);    
             //如果是目录则使用递归    
            }else{    
                files.addAll(getAllFiles(name));    
            }    
        }    
        return files;    
    }   
}
