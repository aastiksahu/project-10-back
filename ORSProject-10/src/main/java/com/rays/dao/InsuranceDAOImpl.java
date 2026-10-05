package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.InsuranceDTO;

@Repository
public class InsuranceDAOImpl extends BaseDAOImpl<InsuranceDTO> implements InsuranceDAOInt {

	@Override
	public Class<InsuranceDTO> getDTOClass() {
		return InsuranceDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(InsuranceDTO dto, CriteriaBuilder builder, Root<InsuranceDTO> qRoot) {

		List<Predicate> wherecondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPolicyHolderName())) {

			wherecondition.add(builder.like(qRoot.get("policyHolderName"), dto.getPolicyHolderName() + "%"));

		}

		if (!isEmptyString(dto.getPolicyType())) {

			wherecondition.add(builder.like(qRoot.get("policyType"), dto.getPolicyType() + "%"));
		}

		return wherecondition;
	}

}
