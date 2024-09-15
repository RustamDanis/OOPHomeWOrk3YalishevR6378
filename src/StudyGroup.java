import java.util.Iterator;
import java.util.List;

class StudyGroup {
    private String groupName;

    public StudyGroup(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
}

class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> studyGroups;

    public Stream(List<StudyGroup> studyGroups) {
        this.studyGroups = studyGroups;
    }

    // Метод для итерации по учебным группам
    @Override
    public Iterator<StudyGroup> iterator() {
        return studyGroups.iterator();
    }

    public int getGroupCount() {
        return studyGroups.size();
    }
}