package HW3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> streamGroupList = new ArrayList<>();
    private int groupsCount;

    public Stream(List<StudyGroup> streamGroupList) {
        this.streamGroupList = streamGroupList;
        this.groupsCount = streamGroupList.size();
    }

    public void addGroup(StudyGroup studyGroup) {
        streamGroupList.add(studyGroup);
        groupsCount++;
    }
    public void removeGroup(StudyGroup studyGroup) {
        streamGroupList.remove(studyGroup);
        groupsCount--;
    }

    public List<StudyGroup> getStreamGroupList() {
        return streamGroupList;
    }

    public int getGroupsCount() {
        return groupsCount;
    }

    public void setStreamGroupList(List<StudyGroup> streamGroupList) {
        this.streamGroupList = streamGroupList;
    }

    public void setGroupsCount(int groupsCount) {
        this.groupsCount = groupsCount;
    }

    @Override
    public String toString() {
        return "\n" + "Stream " + "\n" + "_".repeat(20) + "\n" +
                "  streamGroupList= " + streamGroupList + "\n" +
                "  groupsCount= " + groupsCount +
                "\n" + "*".repeat(20);
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return streamGroupList.iterator();
    }
}
