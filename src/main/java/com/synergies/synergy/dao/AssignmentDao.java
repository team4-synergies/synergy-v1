package com.synergies.synergy.dao;

import com.synergies.synergy.domain.dto.AssignmentDto;
import com.synergies.synergy.domain.vo.AssignmentVo;
import com.synergies.synergy.domain.dto.AssignmentResponseDto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AssignmentDao {
    int insertAssignment(AssignmentVo assignment);
    List<AssignmentDetail> getTodayAssignment();
    List<AssignmentVo> selectAllAssignment();
    List<AssignmentDetail> selectAllAssignmentTitle();
    AssignmentContent selectAssignmentDetails(int assignmentId);
    AssignmentContent selectRecentAssignment();
    boolean deleteAssignment(int assignmentId);
}
