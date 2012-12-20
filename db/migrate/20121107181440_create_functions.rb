class CreateFunctions < ActiveRecord::Migration
  def change
    create_table :functions do |t|
      t.string :name
      t.integer :context_id
      t.integer :kind_id
      t.integer :return_kind_id
      t.text :body
      t.integer :class_id
      t.integer :object_id
      t.integer :user_id

      t.timestamps
    end
  end
end
