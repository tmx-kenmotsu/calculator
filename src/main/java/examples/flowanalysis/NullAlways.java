public void createDir(File dir) {
    if (dir != null || !dir.exists())
        dir.mkdir();
}