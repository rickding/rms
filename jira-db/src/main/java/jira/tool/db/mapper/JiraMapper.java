package jira.tool.db.mapper;


import jira.tool.db.model.Story;
import jira.tool.db.model.User;

import java.util.List;

public interface JiraMapper {
    // For weekly report
    List<Story> getStartPlanStoryList();
    List<Story> getResolvedStoryList();
    List<Story> getStartDateList();
    List<Story> getReleaseDateList();
    List<Story> getCustomerList();
    List<Story> getCustomerOptionList();

    // For ea2jira and jira2ea
    List<User> getUserList();
    List<Story> getPMOStoryList();
    List<Story> getEAGUIDList();
    List<Story> getPMOLabelList();
}