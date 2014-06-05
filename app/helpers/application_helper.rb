# Methods added to this helper will be available to all templates in the application.
module ApplicationHelper
end

module ActionView::Helpers::InstanceTagMethods
  remove_const :DEFAULT_TEXT_AREA_OPTIONS rescue nil
  DEFAULT_TEXT_AREA_OPTIONS = { "cols" => 4, "rows" => 5 }
end
