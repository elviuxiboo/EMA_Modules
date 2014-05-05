package mx.ipn.escom.ema.services.impl;

import java.util.ArrayList;
import java.util.List;

import mx.ipn.escom.ema.model.entities.Tags;
import mx.ipn.escom.ema.model.tags.DAO.TagsDAO;
import mx.ipn.escom.ema.model.tags.DAO.impl.TagsDAOimpl;
import mx.ipn.escom.ema.services.TagsService;
import mx.ipn.escom.ema.to.AttributesTO;
import mx.ipn.escom.ema.to.TagsTO;

public class TagsServiceImpl implements TagsService{

	public List<TagsTO> getAllTags() {
		List<Tags> listTags = new ArrayList<Tags>();
		List<TagsTO> listTagsTO = new ArrayList<TagsTO>();
		TagsDAO tagsDAO = new TagsDAOimpl();
		TagsTO tagTO = new TagsTO();
		listTags = tagsDAO.getTags();
		for(int i=0; i<listTags.size(); i++){
			Tags tag = listTags.get(i);
			tagTO.setName(tag.getName());
			tagTO.setDescription(tag.getDescription());
			listTagsTO.add(tagTO);
		}
		return listTagsTO;
	}

	public List<AttributesTO> getAttributesofTag(TagsTO tagTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
